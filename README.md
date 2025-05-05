# 🍽 レストラン評価サイト（Spring Webアプリケーション）

## 📖 概要
このプロジェクトは、レストラン評価サイトのクライアントアプリケーションであり、開発を通して **Springフレームワーク** の実践的な使い方を学ぶことを目的としています。

ユーザーはWeb上でレストランのレビューを「検索」「追加」「更新」「削除（CRUD）」などの操作を行うことができ、実際の現場でよく使われる構成・技術に基づいています。

---

## 🛠 使用技術スタック
- **フレームワーク**: Spring Boot / Spring MVC / Spring Data JPA
- **データベース**: MySQL
- **テンプレートエンジン**: Thymeleaf
- **ビルドツール**: Maven
- **開発環境**: Eclipse

---

## ✨ 機能一覧（CRUD対応）

| 機能          | 説明                                                  　|
|---------------|--------------------------------------------------------|
| 🔍 検索機能    | キーワードでレストランを検索可能                         |
| ➕ 追加機能    | レストランのレビュー情報を新規登録                       |
| ✏️ 更新機能    | 登録済みレストランのレビュー情報を編集                 　 |
| ❌ 削除機能    | レストランのレビュー情報を削除                           |
| ⭐ 評価投稿機能 | ユーザーがレビューを投稿できる                  　　　 　|

---

## 📁 プロジェクト構成（例）
📦 -Spring-Web--main
├── 📁 src
│   ├── 📁 main
│   │   ├── 📁 java
│   │   │   └── 📁 com.example.demo
│   │   │       ├── 📁 aop
│   │   │       ├── 📁 controller
│   │   │       ├── 📁 entity
│   │   │       ├── 📁 form
│   │   │       ├── 📁 repository
│   │   │       ├── 📁 service
│   │   │       └── 📄 AjiNavi26Application.java
│   │   └── 📁 resources
│   │       ├── 📁 static
│   │       │   └── 📁 css
│   │       ├── 📁 templates
│   │       ├── 📄 application.properties
│   │       └── 📄 messages.properties
│   └── 📁 test
│       └── 📁 java
├── 📁 target
├── 📄 HELP.md
├── 📄 mvnw
├── 📄 mvnw.cmd
├── 📄 pom.xml


