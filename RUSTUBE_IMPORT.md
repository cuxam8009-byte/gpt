# Rustube source import

This repository is being prepared for the Rustube Android app.

## Import the prepared source archive

1. Download `Rustube-source.zip` from the ChatGPT conversation.
2. Open this repository on the `main` branch.
3. Select **Add file → Upload files**, upload `Rustube-source.zip` to the repository root, and commit the upload.
4. Open **Actions → Import Rustube source archive → Run workflow**. Select `main` and run it.
5. The workflow extracts the archive's `Rustube/` folder into the repository root, removes the temporary ZIP, and commits the imported files.

The workflow requires GitHub Actions to be enabled and repository Actions permissions to allow write access to contents.
