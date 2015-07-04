# Overview

Xavier is a web application that helps following your Android applications comments on Google Play Store. It contains of two parts:
* HTML web page with single REST endpoint used for updating view
* scheduled task that runs in background responsible for parsing new comments out of Google Play Store

All the data stored by Xavier lives in file database. Place where the database will be placed depends on the settings file or parameters passed on the ramp up.
