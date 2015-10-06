package me.jeffshaw.strawman

import scala.annotation.unchecked.uncheckedVariance

trait StrawmanMethods[+A] extends {

  def foldLeft[B](z: B)(op: (B, A) => B): B

  def foldRight[B](z: B)(op: (A, B) => B): B

  def isEmpty: Boolean

  def head: A

  def iterator: java.util.Iterator[A @uncheckedVariance]

  def view: A

  def view(from: Int, until: Int)

  def to[Coll](implicit conversion: Convertable[this.type, Coll]) = {
    conversion.convert(this)
  }

}
