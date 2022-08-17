# Platform compat tools

Tools for Android App Compat (go/android-compat).

## What's in here?

<!--
# Get the dir structure:
$ tree -F --dirsfirst -d --prune  tools/platform-compat/
-->

```
├── build # python helper scripts for build
├── java # All Java source files; directories follow corresponding java packages
│   └── android
│       ├── compat
│       │   └── annotation # Annotations used for go/compat-framework and go/unsupportedappusage
│       └── processor
│           └── compat  # Java annotation processors for annotations defined in src/
│               ├── changeid # Creates compat_config xml files from @ChangeId constants
│               └── unsupportedappusage # Creates csv files with source positions for @UnsupportedAppUsage elements
└── javatest # Tests for source files defined under java/
```
