Deep Copy vs Shallow Copy in OOPs

**Shallow Copy**:
- A shallow copy of an object is a new object that is a copy of the original object, but it only copies the references to the nested objects. This means that if the original object contains references to other objects, both the original and the copied object will refer to the same nested objects.
- Changes made to the nested objects in either the original or the copied object will be reflected in both, since they share the same references.
- In Java, a shallow copy can be created using the `clone()` method from the `Object` class, but it requires the class to implement the `Cloneable` interface.
```java class Person implements Cloneable {
    String name;
    Address address; // Address is another class

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}
```     
**Deep Copy**:
- A deep copy of an object is a new object that is a copy of the original object   and all of the objects it references. This means that all nested objects are also copied recursively, resulting in a completely independent object.
- Changes made to the nested objects in either the original or the copied object will not affect the other, since they are completely separate.
- In Java, a deep copy can be implemented by overriding the `clone()` method and manually cloning the nested objects.
```java