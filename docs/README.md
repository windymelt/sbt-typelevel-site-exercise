# Handy Scala

このページはLaikaとmdocを用いたページで、Scala 3の入門ページを模しています。

## コメント

Scalaではコードの説明を書いたり、途中の行を一時的に書いていないことにするために、ソースコードの一定部分を無視させることができます。これが**コメント**です。

コードの一部をコメントにすることをコメントアウトと呼びます。

Scalaでは、`//`を使うことでその行をコメントアウトできます。

```scala
// この行は無視される
```

また、`/*`と`*/`で囲んだ部分もコメントになります。これは複数行を一気にコメントアウトしたりするのに便利です。

```scala
/*
ここはコメント
ここもコメント
*/
```

## 値の定義

Scalaでは、`val`を使って**値**を定義します。

```scala mdoc
val x = 42
```

return {
  dark2 = "#19181a",
  dark1 = "#221f22",
  background = "#2d2a2e",
  text = "#fcfcfa",
  accent1 = "#ff6188",
  accent2 = "#fc9867",
  accent3 = "#ffd866",
  accent4 = "#a9dc76",
  accent5 = "#78dce8",
  accent6 = "#ab9df2",
  dimmed1 = "#c1c0c0",
  dimmed2 = "#939293", -- border
  dimmed3 = "#727072",
  dimmed4 = "#5b595c",
  dimmed5 = "#403e41",
}
