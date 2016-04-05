A Sample Lucene App for Android
===============================

This is the Android version of [lucenestudy](https://github.com/lukhnos/lucenestudy/tree/mobile).
It depends on the mobile branch of that project, which in turn comes with
prebuilt JARs of [Mobile Lucene](https://github.com/lukhnos/mobilelucene),
an experimental port of Lucene to Android.

To build the app:

    git submodule update --init --recursive
    ./gradlew -PANDROID_BUILD_TOOLS_VERSION=23.0.3 build

where `-PANDROID_BUILD_TOOLS_VERSION=23.0.3` is optional if one needs
to use a different version of Android build tools, e.g. 23.0.3,
otherwise the default one from `gradle.properties` will apply.

To run lucenestudy's tests on a connected Android device or emulator:

    ./gradlew connectedAndroidTest

For more information about the app and its data source, please visit the
[lucenestudy](https://github.com/lukhnos/lucenestudy/tree/mobile) project.

The app is also available on [Google Play](https://play.google.com/store/apps/details?id=org.lukhnos.lucenesearchdemo).
