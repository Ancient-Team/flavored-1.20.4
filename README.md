# Flavored

# Description

# Api Implementation

`build.gradle`

```gradle
repositories {
}

dependencies {
	
}
```

`fabric.mod.json`
```json
"entrypoints": {
		"flavoured": [ "com.example.implementations.FlavouredCompat" ]
}
```

Java file
```java
package com.example.implementation;

import ancient.flavored.api.FlavouredCompatApi;

public class FlavouredCompat implements FlavouredCompatApi {
    void onInitializeCompat() {
        // Here you can implement blocks, items etc.
    }
}

```
