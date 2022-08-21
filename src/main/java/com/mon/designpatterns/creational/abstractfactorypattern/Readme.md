An abstract factory pattern is a set of factory methods.
It makes use of multiple factory methods. **The abstract factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes**.<br/>
For example, if you just had factory method pattern, you won't necessarily have control of whether you mix an object suitable for one object for another. With abstract factory pattern, you have that control.<br/>
Whether the methods return the same type or not is a totally different matter. But it is all the Abstract Factory Pattern.<br/>
This way, if we provide a client with concrete implementations of an abstract factory, at runtime, clients can inject the necessary implementations of the abstract factory and be certain that whatever objects created would be related.
That way, we are certain that clients do not combine the wrong set of objects together.<br/>
Abstract factory = Factory class with multiple related factory methods.<br/>
NB: The methods might even return the same type(Class) but differently constructed with different parameters.<br/>
[video](https://www.youtube.com/watch?v=v-GiuMmsXj4)