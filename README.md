A Sample Lucene App for Android
===============================

This is the Android version of [lucenestudy](https://github.com/lukhnos/lucenestudy/tree/mobile).
It depends on the mobile branch of that project, which in turn comes with
prebuilt JARs of [Mobile Lucene](https://github.com/lukhnos/mobilelucene),
an experimental port of Lucene to Android.

To build the app:

    git submodule update --init --recursive
    ./gradlew build

To run lucenestudy's tests on a connected Android device or emulator:

    ./gradlew connectedAndroidTest

For more information about the app and its data source, please visit the
[lucenestudy](https://github.com/lukhnos/lucenestudy/tree/mobile) project.
