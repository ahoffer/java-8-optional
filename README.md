# java-8-optional
Experiments with Java 8's Optional class and its map() and flatMap() methods.


## Flat map has extra smarts not to wrap an optional

```
GIVEN an optional with a value AND a function that returns an OPTIONAL, THEN
	MAP returns Optional[Optional[ALAKAZAM]]
	FLAT MAP returns Optional[ALAKAZAM]
```

## Map has enough smarts not to wrap an EMPTY optional
```
GIVEN an empty optional AND a function that returns an OPTIONAL, THEN
	MAP returns Optional.empty
	FLAT MAP returns Optional.empty
```

## Flat map requires a function that returns an Optional
```
GIVEN an optional with a value AND a function that returns an STRING, THEN
	MAP returns Optional[BOJANGLES]
	FLAT MAP does not accept functions that do not return an Optional.
```
