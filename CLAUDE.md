# CLAUDE.md

Instructions for Claude agents.

- Commit often.
- Before you start working, look at `README.md` to better understand the goals of the project.
- Before you start working, look at the contents of `docs/` and especially `docs/decisions.md` to understand my design philosophy.
- You should never modify `docs/decisions.md`.
- When making a pull request, rename the branch if necessary. Branches should be named as follows:

```text
{type (bug, enhancement, cleanup, etc)}/{issue number}-{name}
```

- When making a pull request that targets a particular issue, put closes #{issue number} in the BODY of the PR so GitHub can connect the issue to the PR. Do not put the issue number in the PR title because GitHub cannot detect that.
- Unless a pull request exclusively adds documentation, you should always include a test plan.
- You should make pull requests as drafts.
