# Phlom AI

Phlom AI is an Android chat client built around the original Phlom dark/purple chat layout and ghost mascot.

## Providers
- OpenAI Chat Completions
- Google Gemini
- Anthropic Claude Messages
- OpenRouter
- Custom OpenAI-compatible endpoint

The optional web-search toggle uses Tavily Search. A calculator is not yet exposed as a separate tool in this first implementation. Model reasoning depth is model/provider dependent; the app does not expose hidden chain-of-thought.

## API key storage
On Android, provider and Tavily keys are encrypted with AES-GCM using a key generated in Android Keystore. Keys are not committed to this repository and are not packaged into the APK. Configure them in the app's settings. API usage may incur provider charges.

## Build
GitHub Actions workflow: **Phlom Android APK**. It builds the debug APK on pushes to `phlom-ai` and on manual dispatch, then uploads `app-debug.apk` as a workflow artifact.

Local:
```bash
cd Phlom-AI
gradle :app:assembleDebug
```

## Current limitations
- Provider calls are made directly from the Android WebView; provider-side network/CORS policy may vary.
- No backend proxy, account sync, conversation export, image understanding, voice input, or native file analysis yet.
- Web search requires a Tavily key and is injected as retrieved context; verify sources before relying on them.
