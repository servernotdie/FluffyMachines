#!/usr/bin/env bash
set -euo pipefail

FIX_COMMIT="${1:-8fce67350086a0650591f2b45787f6f060b433d0}"

echo "==> Reverting mytai20100 fix commit ${FIX_COMMIT} (source only, patches/ kept)"
git revert --no-commit "$FIX_COMMIT"
git restore --staged --source=HEAD -- patches/ 2>/dev/null || true
git restore --source=HEAD -- patches/ 2>/dev/null || true
git commit -m "revert: undo mytai20100 fix ${FIX_COMMIT}"
echo "==> Done. Source restored to pre-fix state; patches/*.patch untouched."
