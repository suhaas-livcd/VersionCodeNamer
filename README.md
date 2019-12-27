# VersionCodeNamer

>VersionCodeNamer is a library to deal automatic naming of the versions in a systematic and organised way with the version names.
Users dont have to worry about the names, what would be next, release the application with the name by choosing
from a wide range of list.

## Installation

Use the [jitpack.io](https://jitpack.io/#suhaas-livcd/VersionCodeNamerLibrary) to check dependency.

```
implementation 'com.github.suhaas-livcd:VersionCodeNamerLibrary:+'
```

## Usage

```

    import com.hosteloha.versioncodenamerlib.VersionCodeNamer;
    import com.hosteloha.versioncodenamerlib.VersioningType;

    String customVersionName = VersionCodeNamer.getName(versionCode, VersioningType.CHEMICAL_ELEMENTS);
    TextView appVersionName = findViewById(R.id.application_version_name);
    appVersionName.setText(customVersionName);


```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
----

## changelog
* Dec 27, 2019 - ** A kindle **

----
## thanks
* [Alphabetizer] (https://alphabetizer.flap.tv/lists/)


## License
[MIT](https://choosealicense.com/licenses/mit/)