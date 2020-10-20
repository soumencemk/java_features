package jdk15;

public sealed class Animal permits Dog{
}
non-sealed class Dog extends Animal{

}
