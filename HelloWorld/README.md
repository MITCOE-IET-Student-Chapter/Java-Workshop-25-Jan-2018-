# First Program as explained in the workshop 

Simple java program to demonstrate working of javac and java

The DemoProg directory has a similar code which was demonstrated in the workshop

As a general suggestion .java should be named as the class name
for eg.
```
class Hello{
	...
}
```
should be saved as Hello.java
This is helpful because after compling, complier builds the byte code with the name of class name

in this case Hello.class

## Instruction to compile and run

to compile open terminal and move to the directory where .java is saved and run
`javac Hello.java`

errors if any will be generated..
if not run 

`java Hello`

## Output

Your demo message will be printed on the command prompt

`Hello World`

## Misc Commands 

`javap [package_name]`

Give you the package heirarchy 
for eg.
`javap java.lang.System`
will give you package heirarchy of java.lang.Systems