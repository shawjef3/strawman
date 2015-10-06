package me.jeffshaw.strawman

trait Iterable[+A] {
  def iterator: Iterator[A]
}
