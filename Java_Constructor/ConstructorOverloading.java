package Java_Constructor;

public class ConstructorOverloading {
	   int length, width;

	   ConstructorOverloading() {
	        length = width = 0;
	    }

	   ConstructorOverloading(int l) {
	        length = width = l;
	    }

	   ConstructorOverloading(int l, int w) {
	        length = l;
	        width = w;
	    }
}
/*
| Concept               | Description                |
| --------------------- | -------------------------- |
| Purpose               | Initializes object values  |
| Name                  | Same as class              |
| Return type?          | ❌ No return type          |
| Can be overloaded?    | ✅ Yes                     |
| Called automatically? | ✅ Yes (when `new` is used)|

 */