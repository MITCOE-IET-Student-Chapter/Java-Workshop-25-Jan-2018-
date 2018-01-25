# Demonstrating use of class, setters and getters


## Setters

Setters are a class of functions, that set the value of any class attribute

For example, a general structure of a `setter` function for Name variable in Person Class is,

```java

public void setName(String name) {
    
    this.name = name;

}

```

These functions take the value to be set as the parameter.
These functions do not return any value, i.e., they return void.

## Getters

Getters are a class of functions, that return the value of any particular class attribute.

For example, a general structure of a `getter` function for Name variable in Person Class is,


```java

public String getName() {

    return this.name;

}

```

These functions do not take any parameters.
These functions return the value of the attribute.