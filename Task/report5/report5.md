## プログラミングⅡ 
### レポート課題5: 「例外に慣れよう」

<script type="text/javascript" async src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.7/MathJax.js?config=TeX-MML-AM_CHTML">
</script>
<script type="text/x-mathjax-config">
 MathJax.Hub.Config({
 tex2jax: {
 inlineMath: [['$', '$'] ],
 displayMath: [ ['$$','$$'], ["\\[","\\]"] ]
 }
 });
</script>

<div style="text-align: right;">
編集日:2022-11-29<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>

#### ステップ1: コードの準備
1. prog2に関して全体のコードをリポジトリで管理しており、report5に関係するものは以下のリンクである。
[https://github.com/medicine-t/prog2_2022/tree/main/Task/report5]()
2.  java.lang.NullPointerExceptionについて教科書とAPIドキュメントで調べ、数行〜10行程度で説明せよ。
`NullPointerException`はobjectが必要な場面においてnullを利用しようとしたときに発生するランタイムエラーの一種。例としてnullのインスタンスメソッドを呼び出そうとするときやnullインスタンスのフィールドにアクセスしたり編集を試みた際に発生する。

#### ステップ2: 例外処理を記述せよ。
実行結果
```bash
NullPointerexceptionが発生しました
Cannot invoke "String.length()" because "str" is null
```
実行結果
```bash
NullPointerexceptionが発生しました
Cannot invoke "String.length()" because "str" is null
```

#### ステップ3: APIリファレンスを参照してみよう。
##### Integer.parseInt()メソッドと発生した例外について、APIリファレンスで調べよ。
1.  Integer.parseInt() メソッドの定義のコピペ。（説明文とparameters, returns, throwsの合計4項目を含むこと）
```
parseInt
public static int parseInt(String s)
                    throws NumberFormatException
Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. The resulting integer value is returned, exactly as if the argument and the radix 10 were given as arguments to the parseInt(java.lang.String, int) method.
Parameters:
s - a String containing the int representation to be parsed
Returns:
the integer value represented by the argument in decimal.
Throws:
NumberFormatException - if the string does not contain a parsable integer.
```
2. 上記コピペ文を読み、項目毎に分かることを解説せよ。
* 説明文
  * stringを符号付き10進表記の整数としてパースを行う。stringに含まれる文字は10進数でなくてはならないが、文字列のはじめに`+`,`-`を符号を表すために表記することができる。`parseInt(String,10)`と同様の結果が得られる。
* Parameters
  * 変換される文字列を含むString
* Returns
  * 10進数として表現された整数の値が返却される
* Throws
  * 整数に変換できる文字列が含まれていない場合に`NumberFormatException`をthrowする

(3)　NumberFormatExceptionクラスのスーパークラスについて
* スーパークラスの名称
  * IllegalArgumentException
* 概要説明文
  * Thrown to indicate that a method has been passed an illegal or inappropriate argument.
* 解説
  * メソッドへ不正なもしくは不適切な引数が渡された場合に発生する例外である。自らで実装したExceptionクラスに継承する際に使用できるコンストラクタとしてgetMessageなどで表示させることの出来るStringや原因となったthrowableオブジェクトを渡すことができる。
