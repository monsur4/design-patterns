Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
<br/>
Imagine you want to have different kinds of shapes (circle, square, triangle) and each is to have different colors (red, yellow, green), instead of creating 9 different combinations of classes(as would be done via inheritance), you can separate them into different inheritance hierarchies, one for colors and one for shapes.
<br/>
Then, set one as the base class and have it be composed of(have a field that references) the other type of hierarchy. Therefore, simply reference/call the referenced class methods<br/> So that, that way you can add as many shapes or colors as you want without worrying about class explosion.<br/>
That point of composing one object with another is the bridge!!!