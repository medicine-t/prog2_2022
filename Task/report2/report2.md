## プログラミングⅡ 
### 課題レポート2 : クラス検討してみよう

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
編集日:2022-XX-XX<br>
報告者:e225717 高嶺拓矢<br>  
協力者:なし
</div>

#### Level 1: オブジェクトを検討してみよう。
- Level1.1: 商品を持っていくと決済処理し、決済後にレシート出力するPOSレジ
  - Class名: PosSystem
    - フィールド
      - products: [ProductInfo]
      - subTotal: int
      - tax: HashMap<String,double>
        - 対象税名称:税小計
      - issueDatetime: LocalDateTime 
        - 発行日時記録用
      - manager:String
        - レジ担当者
      - user: UserInfo
    - メゾット
      - add(ProductInfo) -> void
        - 引数として受け取った製品情報をproducts配列に追加する。小計、税計がそれぞれ更新される。
      - printReceipt() -> void
        - レシートの印刷処理を行う
        - 記載事項は以下の通り 
          - 発行日時(issueDatetime)
          - 担当者(manager)
          - 商品N , 値段(税抜)
          - 小計
          - 消費税
          - 合計
          - 顧客個人向け情報 (user)
            - getCustomizedInformation() != nullの場合のみ
  - Class: UserInfo
    - フィールド
      - userId: int
    - メゾット
      - getCustomizedInformation() -> String
        - 顧客情報と関連してレシートに付属されるべき情報
  - Class: ProductInfo
    - フィールド
      - private
        - name: String
        - basePrice: int
        - taxRate: double
      - public
        - None
    - コンストラクタ
      - ProductInfo(name,basePrice,TaxRate,taxDescription)
    - メゾット
      - public
        - getPriceInTax() -> double
          - 消費税込みの価格を返すgetter。
        - getProductName() -> String
          - 商品名を返すgetter。
        - setBasePrice(int) -> void
          - 基本価格のsetter
        - setTaxRate(double,String) -> void
          - TaxRate,taxDescriptionのsetter
        - setName(String) -> void
          - 商品名のsetter
      - private
        - setTaxDescription(String)
          - 税金計に表示されるdescription
- Level1.2
