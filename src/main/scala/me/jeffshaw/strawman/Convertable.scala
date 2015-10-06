package me.jeffshaw.strawman

trait Convertable[-A, +B] {
  def convert(in: A): B
}
