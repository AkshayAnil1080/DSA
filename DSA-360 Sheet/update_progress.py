#!/usr/bin/env python3
"""
Recalculate DSA tracker progress from PROGRESS.md.

Usage:
    python3 update_progress.py

The script counts only checkbox lines:
    - [ ] ...
    - [x] ...
and updates the overall progress block.
"""

from pathlib import Path
import re

TRACKER = Path(__file__).with_name("PROGRESS.md")
TARGET = 20  # visual progress-bar width

text = TRACKER.read_text(encoding="utf-8")

checked = len(re.findall(r"^- \[x\] ", text, flags=re.MULTILINE | re.IGNORECASE))
total = len(re.findall(r"^- \[[ xX]\] ", text, flags=re.MULTILINE))

if total == 0:
    raise SystemExit("No checklist items found.")

pct = checked / total * 100
filled = round(TARGET * checked / total)
bar = "█" * filled + "░" * (TARGET - filled)

replacement = (
    "<!-- PROGRESS_START -->\n"
    f"**Solved: {checked} / {total} ({pct:.1f}%)**\n\n"
    f"`{bar}` {pct:.1f}%\n"
    "<!-- PROGRESS_END -->"
)

pattern = r"<!-- PROGRESS_START -->.*?<!-- PROGRESS_END -->"
updated, count = re.subn(pattern, replacement, text, count=1, flags=re.DOTALL)

if count != 1:
    raise SystemExit("Could not find the PROGRESS_START/PROGRESS_END markers.")

TRACKER.write_text(updated, encoding="utf-8")
print(f"Updated: {checked}/{total} solved ({pct:.1f}%)")
