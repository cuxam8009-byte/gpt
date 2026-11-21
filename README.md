# Rustube

Android video client workspace. This repository is the working location for the Rustube project.

## Working branch

- `rustube-work` — active development branch
- `main` — kept unchanged as the starting point

## Project direction

- Android app, Kotlin + Jetpack Compose
- YouTube extraction remains in the existing extractor layer
- Media playback remains on AndroidX Media3 / ExoPlayer
- Rust is introduced only for isolated, measurable CPU-heavy tasks through JNI
- UI direction: monochrome, Apple-inspired visual language; original Rustube layout and identity

## Development rules

1. Preserve working playback, search, subscriptions, downloads and background behavior unless a change is explicitly planned.
2. Profile before claiming performance improvements.
3. Port one isolated unit at a time; keep a Kotlin fallback and tests.
4. Build and test each meaningful change before merging.
5. Do not reuse the upstream project's updater endpoint or signing credentials.

## Current workspace status

The repository was initially a minimal workspace. The Rustube source archive was prepared separately in the conversation; it has **not yet been expanded into this repository**. The next repository step is to import the source tree, inspect it against this plan, then wire up Android CI.

