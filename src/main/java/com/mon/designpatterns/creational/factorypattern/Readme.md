The factory method pattern defines an interface for creating an object but lets subclasses define what class to instantiate. Factory method pattern lets a class defer instantiation to subclasses.<br/>
The key point of factory method pattern is that, in the end, you want an object. You don't necessarily know how you want to construct the object, why you want to construct that object and what parameters you want to pass when constructing that object. These are all unknowns, and that is why you want to defer. This is why you want to let somebody else take that decision.<br/>
So, it's not only about the class being instantiated but also what you want to pass to the class being instantiated.<br/>
The products are the things we want to create, but the factory are the things that define how we want to go about the creation (but abstracts that away).<br/>
When you find good abstractions (or factories), when you parameterize them in good ways, **you suddenly realize that you need fewer types**. It's like you turn types into properties.<br/>
And factory pattern are a very helpful tool in trying to move away from class explosion into a world where we have a few key classes where there is a lot of variation that can happen by simply combining them in appropriate ways and instantiating them with different properties.<br/>
[very useful video](https://www.youtube.com/watch?v=EcFVTgRHJLM)