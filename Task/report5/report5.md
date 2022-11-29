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
編集日:2022-11-XX<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>

#### ステップ1: コードの準備
1. prog2に関して全体のコードをリポジトリで管理しており、report5に関係するものは以下のリンクである。
[https://github.com/medicine-t/prog2_2022/tree/main/Task/report5]()
2.  java.lang.NullPointerExceptionについて教科書とAPIドキュメントで調べ、数行〜10行程度で説明せよ。
`NullPointerException`はobjectが必要な場面においてnullを利用しようとしたときに発生するランタイムエラーの一種。例としてnullのインスタンスメソッドを呼び出そうとするときやnullインスタンスのフィールドにアクセスしたり編集を試みた際に発生する。

#### ステップ2: 例外処理を記述せよ。
