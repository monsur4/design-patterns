Strategy pattern allows you to define different algorithms(strategies) and at run time switch one algorithm for another.<br/>
It allows  you to separate your business logic(context) from the algorithms it uses. Imagine that, instead of having a number of algorithms within your business logic and switch on the one to use by some conditional (if/switch statement). You can instead remove each of those conditions, abstract them away into a common interface that they all implement. This way, the business logic doesn't need to know which algorithm it uses, it just knows it uses some algorithm to do something.<br/>
This is really powerful when you think of the algorithms as being really similar methods with different internal representations. So that at run time, you can easily switch between them.<br/>
<br/>
Imagine you have a path finding algorithm in an app. You can have one for cars, bike riders, pedestrians etc. Therefore you can have a common strategy interface(PathFindingStrategy), implement each of the path finding algorithm within its own class that implements the strategy interface.<br/>
You end up with a CarPathFindingStrategy, BikePathFindingStrategy, PedestrianPathFindingStrategy etc. And at run time, the commuter can select the strategy to use in finding the best path.<br/>
**Really powerful!!!**.<br/>
[blog](https://refactoring.guru/design-patterns/strategy) <br/>
[video](https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc)