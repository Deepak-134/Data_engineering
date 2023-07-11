package com.allaboutscala.chapter.one

/*
str.length
str.concat("substr") OR str1 + str2
str.charAt(index)
word.startsWith("str")
word.endsWith("str")
word.replace("old_str","new_str")                   ***
word.distinct   -------- removes duplicate chars    ***
word.take(3) ----------  keeps only first 3 chars of string
fbb.takeRight(3)                 // baz
fbb.takeWhile(_ != 'r')          // foo ba
word.drop(3) ----------  drops left/first 3 chars of string
fbb.dropRight(2)  ------- drops right/right 2 chars of string
fbb.toLowerCase                  // foo bar baz
fbb.toUpperCase                  // FOO BAR BAZ
word.capitalize
"word" == "word" ---- True   ||  "word" == "word3" ---- False
word.map(x => x.toUpper)
word.foreach(x => print(x.toUpper))
word.count(_ == 'a')              // 2   // count of "a" in string
word.filter(_ != 'a')              // removes "a"
word.dropWhile(_ != ' ')           // drops chars from left until it encounters " "
"hello world".distinct             // "helo wrd"
a intersect b                      // return common char of b in a
a diff b                           // "seven" diff["six"] ====> "even"
fbb.toList                       // List(f, o, o,  , b, a, r,  , b, a, z)
fbb.toSet                        // Set(f, a,  , b, r, o, z)

fbb.getBytes.foreach(println)    // prints the byte value of each character, one value per line
fbb.head                         // f
fbb.headOption                   // Some(f)
fbb.indexOf('a')                 // 5
fbb.isEmpty                      // false
fbb.lastIndexOf('o')             // 2
fbb.length                       // 11
fbb.map(_.toUpper)               // FOO BAR BAZ
fbb.map(_.byteValue)             // Vector(102, 111, 111, 32, 98, 97, 114, 32, 98, 97, 122)
fbb.min                          // " "
fbb.mkString(",")                // f,o,o, ,b,a,r, ,b,a,z
fbb.mkString("->", ",", "<-")    // ->f,o,o, ,b,a,r, ,b,a,z<-
fbb.nonEmpty                     // true
fbb.trim                         // "foo bar baz"

fbb.replace("o", "x")            // fxx bar baz
fbb.replaceAll("o", "x")         // fxx bar baz
fbb.replaceFirst("o", "x")       // fxo bar baz
fbb.reverse                      // zab rab oof
fbb.size                         // 11 = no. of elements
fbb.slice(0,5)                   // foo b
fbb.slice(2,9)                   // o bar b

fbb.sortWith(_ < _)              // "  aabbfoorz"
fbb.sortWith(_ > _)              // "zroofbbaa  "
fbb.sorted                       // "  aabbfoorz"

fbb.split(" ")                   // Array(foo, bar, baz)
fbb.splitAt(3)                   // (foo," bar baz")

fbb.substring(0,3)               // "foo"
fbb.substring(0,4)               // "foo "
fbb.substring(1,5)               // "oo b"
fbb.substring(1,6)               // "oo ba"
fbb.substring(0, fbb.length-1)   // "foo bar ba"
fbb.substring(0, fbb.length)     // "foo bar baz"

fbb.tail                         // oo bar baz
fbb.toArray                      // Array(f, o, o,  , b, a, r,  , b, a, z)
fbb.toBuffer                     // ArrayBuffer(f, o, o,  , b, a, r,  , b, a, z)
fbb.toStream                     // Stream[Char] = Stream(f, ?)
fbb.toVector                     // Vector(f, o, o,  , b, a, r,  , b, a, z)
fbb.view                         // SeqView[Char,String] = SeqView(...)

 */

/*
Multiline string
val multistr : String = """ Lenght of Apple is 5
                            |Apple is a good fruit
                            |Apple is a good fruit""".stripMargin

val multistr : String = """ Lenght of Apple is 5
                            #Apple is a good fruit
                            #Apple is a good fruit""".stripMargin(#)
 */

/*
# String interpolation/substitution
  - s  ----> to embed variable into string
  - f  ----> to deal with integer accuracy into the string
  - raw ----> to print escape characters as it is

val variable1 = 32.32
println(s"To access $variable1 or expreesion ${variable1*4}")
println(f"To deal with integer formatting like printf $variable1%.1f kg")
println(raw"foo\nbar")
*/

/*
# Treating a String as a Seq[Char]
1) for loop
for (i <- "hello") print(i.toUpper)

2) foreach :- returns unit value which cannot be used further.
"Hello".foreach(x => print(x.toUpper))

3) map :- returns a array or seq which can be used further
val b = "Hello".map(x => x.toUpper)

 */

object String extends App{
  // Defination
  val word: String = "Apple"
//  word.toUpperCase()
//  word.toLowerCase()
  println(word.distinct)
  println(word.drop(3))
  "Hello".foreach(x => print(x.toUpper))
  print("\n")
  val b = "Hello".map(x => x.toUpper)
  println(b)
  for (i <- "hello") print(i.toUpper)
  print("\n")
  // Length of string
  val length = word.length
  println(s"Lenght of $word is $length")

  // Concatenating string
  println(word.concat(" is a good fruit"))
  println(word + " is a good  fruit")

  // charAt(index) ---- gives char at specified index
  println(word.charAt(2))

  //Regular expressions
  //Add .r to the end of a string to create a regular expression
//  val numpattern = "[0-9]{10}".r
  val numpattern = "[a-zA-Z]+".r
  val demoString = "7030616122 9309921451 Deepak Chaudhari 19/10/1998 18/12/1928"
  val match1 = numpattern.findFirstMatchIn(demoString)                         // findFirstMatchIn
  println(match1)
  val allmatches = numpattern.findAllIn(demoString).toList                     // findAllIn
  println(allmatches)

  // replace string content using regular expressions
  println(demoString.replaceFirst("[0-9]","x"))
  println(demoString.replaceAll("[0-9]{5}","xxxxx"))

  // extract the parts of a string
  val pattern2 = "(\\d+)/(\\d+)/(\\d+)".r
  println(pattern2.findAllMatchIn(demoString).toList)

  // Transforming arrays or list to a String
  val lis1 = List("a","p","p","l","e")
  val array1 = Array(1,2,3,4)

  println(lis1.mkString)
  println(lis1.mkString(","))
  println(lis1.mkString(" "))
  println(lis1.mkString("(",",",")"))     //prefix, separator, suffix
  println(array1.mkString(","))

  // distinct, intersect, and diff
  println("Hellooo".distinct)
  val a = "Hello"
  val c = "World"

  println(a intersect(c))
  println(c intersect(a))

  println(a diff(c))
  println((a diff(a)).length)






}
