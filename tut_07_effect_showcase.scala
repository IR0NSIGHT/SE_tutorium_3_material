val x = 5;

def f() = {val x = 5; x}

println(y) //doest compile
def h() = x+1;

def g() = 5;

def v(x: Int) = x+1;  //nicht effectful

const x = () => {
    var y = 0;
    return () => { y + 1; return y}
}
inc = x()
inc();  //0 => y =0, y ++
inc();  //1

val myArr = Array(1,2,3)

yy(myArr);

def yy(arr: List[Int]): List[Int] = {
    return arr.push(0)
}


val x = 5;
println(x)

def hhh() = 2+3-5+5;
println(hhh())



var myAppleOption: Apple = null; //codesmell

def compute() = {
    ...
    myAppleOption = Apple("Red")
}

myAppleOption.color //crashed => Nullpointer



var myAppleOption: Option[Apple] = None(); //codesmell
myAppleOption = Some(Apple("Red"))

myAppleOption.color //Option.color doesnt exist!!

Some(myAppleOption).color // expcetion: None().color doesnt exist

myAppleOption = Some(myApple)

println(myAppleOption) // SOme(myApple)

myAppleOption match {
    case Some(myApple) => myApple.color
    case None() => panic("oh no")
}

def getAppleColor(a: Option[Apple]): String = {
    a match {
    case Some(myApple) => myApple.color
    case None() => "default color"
}
}


Option = None() oder Some(xyz)


def compute() = {
    ...
    myAppleOption = Apple("Red")
}

myAppleOption.color //crashed => Nullpointer











