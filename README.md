# homework7  
## 概要  
第7回講義で行ったnameのリストを使いGET/POST/PATCH/DELETEのレスポンスまで行った。  
また課題のクエリ文字列の取得についてはGETで行い、POSTで年齢を受け取れるようにした。  

### GET  
実行結果  
![スクリーンショット 2023-09-21 23 41 12](https://github.com/yuu3415/homework7/assets/143332858/313066d0-d5a4-48dd-96a5-f37a26571dda)

### POST  
実行結果  
![スクリーンショット 2023-09-22 9 29 57](https://github.com/yuu3415/homework7/assets/143332858/36b1db2f-9e5d-4c48-894e-64f8f5d62d25)

### バリデーション後の実装結果  
・成功 
![スクリーンショット 2023-09-24 19 36 39](https://github.com/yuu3415/homework7/assets/143332858/0795797c-b450-4a92-ab2c-1f574cdbe2f0)

・失敗  
名前に記入漏れあり
![スクリーンショット 2023-09-24 19 36 48](https://github.com/yuu3415/homework7/assets/143332858/98799293-22f2-4226-ae93-d10e35ea0e45)  
名前が20文字以上  
![スクリーンショット 2023-09-24 19 37 07](https://github.com/yuu3415/homework7/assets/143332858/4f6f739b-93cb-4b29-b480-34d8db884298)  
年齢が負の数
![スクリーンショット 2023-09-24 19 37 21](https://github.com/yuu3415/homework7/assets/143332858/9680c15b-bc98-409e-930f-6927f0acec8f)

### クエリ文字列を取得
https://github.com/yuu3415/homework7/blob/3a947b6956e22ea911ccc69142da8c2459375f04/src/main/java/net/raisetech/restapi/NameController.java#L20-L25  
上記のコードでGETにてクエリ文字列を扱えるようにしました。  

### 年齢を受け取る  
https://github.com/yuu3415/homework7/blob/3a947b6956e22ea911ccc69142da8c2459375f04/src/main/java/net/raisetech/restapi/POST/NameCreateRequest.java#L8  
https://github.com/yuu3415/homework7/blob/3a947b6956e22ea911ccc69142da8c2459375f04/src/main/java/net/raisetech/restapi/POST/NameCreateRequest.java#L30-L31  
上記のint型をコンストラクター・ゲッターに追加することでageをPOSTで受け取れるようにしました。
