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
編集日:2022-10-30<br>
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
  - 仕様について
    - レンタカーの管理情報管理システム
      - 各レンタカーの利用者、利用開始日、返却予定日は必須とする
  - Class: Car
    - フィールド
      - carId :int
      - startTime: LocalDate
      - endTime: LocalDate
    - コンストラクタ
      - Car(carId)
    - メゾット
      - setup(period:Duration) -> void
        - 使用開始の処理
      - end() -> void
  - Class: User
    - フィールド
      - userId:int
      - status:int
        - 利用状況ステータス
      - usingCar:Car
    - メゾット
      - register() -> void
        - 登録処理
      - startUsingCar(period:Duration) -> void
        - レンタカー利用開始処理

- Level 2: 教科書7章〜9章について
  - クラス
    - 変数やメゾットなどからなるオブジェクトの金型となるようなもの
  - オブジェクト
    - クラスから生成された実際に利用可能なもの。クラスに設定されているフィールドに値設定され利用可能である。
  - フィールド
    - クラスブロック内で利用される変数。
    - クラス名.変数名で利用可能(publicの場合)
  - コンストラクタ
    - インスタンス生成時に実行されるメソッド
    - オーバーロードは可能だが戻り値を取らないなど通常のメソッドと異なる
  - メソッド
    - 他言語で関数と言われる処理を記述した部分
    - 戻り値と引数が設定される。public/privateのような属性も利用可能
  - this
    - 同一インスタンスを指す変数。this.変数名 や this.func()のように自分自身のフィールドやメソッドにアクセスするために利用される。
  - final
    - クラス、メゾット、変数それぞれに付与することができる
      - クラスに付与した場合は継承の禁止   
      - メゾットに付与した場合はオーバーライドの禁止
      - 変数に付与した場合は再代入の禁止
    - をそれぞれ表す。