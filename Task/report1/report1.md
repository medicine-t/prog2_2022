## プログラミング2
### レポート課題1: 「Javaの言語仕様に慣れよう」

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
編集日:2022-10-10<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>


#### Level 1
引数matrixは二重配列として宣言されている。同様にmainメソッドには2行2列の行列のつもりで二重配列で記述した matrix22_1, matrix22_2。3行2列の matrix_23_1, matrix23_2 が用意されている。このmainメソッドで printMatrix(matrix23_2); として呼び出された状況について、以下の問いに答えよ。なお配列サイズの範囲外を参照している場合には IndexOutOfBoundsException と答えよ。
* (a) printMatrixメソッド内で matrix[0][0] に保存されている値は何か。
  * 6.0
* (b) printMatrixメソッド内で matrix[1][1] に保存されている値は何か。
  * 9.0
* (c) printMatrixメソッド内で matrix[2][2] に保存されている値は何か。
  * IndexOutOfBoundsException

printMatrixで用いられているメソッド System.out.printf について、APIドキュメントで調べよう。
* Level 1.2, メソッド一覧から print, println について調べ、両者の違いを1〜数行で述べよ。
  * printlnはprintと異なり、は末尾に改行文字が挿入される
* Level 1.3, printfメソッドについて報告せよ。
  * (a) メソッド概要文について、1〜数行で説明せよ。
    * フォーマット文字列を標準出力に出力するメゾット。out.printf(l,format,args)はout.format(l,format,args)を呼び出すのと同じ動作をする。
  * (b) 3つの引数 Locale l、String format, Object... args について、各々1〜数行で説明せよ。
    * Locale l
      * 国や地域を表すのに利用されるクラス
      * [ドキュメント](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Locale.html)
    * String format
      * フォーマット構文で記述されているフォーマット文字列
    * Object args
      * formatで指定されているフォーマット指定子によって参照される引数。フォーマット指定子より多い引数が渡された場合、余分な引数は無視される。引数の数は可変で0のときもあり、最大値はJVMにより定義されている配列の最大長に従う。


#### Level 2
行列演算メソッドを書いてみよう。
* mainメソッドには2行2列の行列 matrix22_1, matrix22_2、2行3列の行列 matrix23_1, matrix23_2 を二重配列として宣言している。これらの行列の和を求めるメソッド computeAddMatrix を作成せよ。

愚直な実装としては以下のようなものがある。
```Java
public static double[][] computeAddMatrix(double[][] matrix_1, double[][] matrix_2) {
    double[][] ret = new double[matrix_1.length][matrix_1[0].length]
    if (matrix_1.length != matrix_2.length) {
        System.err.println("行数がおかしい")
    } else if (matrix_1[0].length != matrix_2[0].length) {
        System.err.println("列数がおかしい");
    } else {
        for (int i = 0; i < matrix_1.length; i++) {
            for (int j = 0; j < matrix_1[i].length; j++) {
                ret[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }
    }
    return ret;
}
```

また、Apache Commons Mathを利用した場合のcomputeAddMatrixの実装は以下のようになる。
```Java
public static RealMatrix computeAddMatrix(RealMatrix matrix_1, RealMatrix matrix_2) {
    RealMatrix ret = MatrixUtils
            .createRealMatrix(new double[matrix_1.getRowDimension()][matrix_1.getColumnDimension()]);

    if (matrix_1.getRowDimension() != matrix_2.getRowDimension()) {
        System.err.println("行数がおかしい");

    } else if (matrix_1.getColumnDimension() != matrix_2.getColumnDimension()) {
        System.err.println("列数がおかしい");
    } else {
        ret = matrix_1.add(matrix_2);
    }
    return ret;
}
```
