# Import Rustube source

The complete prepared source is supplied as `Rustube-source.zip`.

1. Open the repository branch `rustube-work`.
2. Upload `Rustube-source.zip` to the repository root using **Add file → Upload files**, then commit the upload to `rustube-work`.
3. Open **Actions → Import Rustube source archive → Run workflow**. Select branch `rustube-work` and run it.
4. The workflow extracts the archive into the repository root, removes the temporary archive, and commits the imported source.

The import workflow requires Actions to be enabled and the GitHub token to have write access to repository contents.
