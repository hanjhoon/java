```java
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>CSS 선택자</title>
    <style>
        /* 태그 선택자 (Tag Selector) */
        p {
            color: rgb(11, 23, 45);
        }

        /* 클래스 선택자 (Class Selector) */
        .my-class {
            font-size: 3vw;
        }
        .my-class p {
            color: red;
        }

        /* 아이디 선택자 (ID Selector) */
        #my-id {
            background-color: beige;
        }

        /* 자식 선택자 (Child Selector) */
        ul > li {
            color: blue;
        }

        /* 인접 형제 선택자 (Adjacent Sibling Selector) */
        h2 + p {
            font-weight: bold;
        }

        /* 일반 형제 선택자 (General Sibling Selector) */
        p ~ a {
            text-decoration: underline;
        }

        /* 속성 선택자 (Attribute Selector) */
        a[title="속성 선택자 (Attribute Selector)"] {
            color: green;
        }

        /* 가상 클래스 선택자 (Pseudo-Class Selector) */
        .link:hover {
            color: red;
        }

        /* 자식 선택자 (Child Selector) */
        table > tbody > tr > td {
            padding: 10px;
            border: 1px solid black;
        }

        /* 일반 형제 선택자 (General Sibling Selector) */
        table td + td {
            text-align: center;
        }

        /* 인접 형제 선택자 (Adjacent Sibling Selector) */
        table th:first-child + th {
            text-align: center;
        }

        /* 자식 선택자 (Child Selector) */
        ul > li {
            color: blue;
        }

        /* 클래스 선택자 (Class Selector) */
        .box {
            border: 1px solid black;
            padding: 10px;
        }

        /* 아이디 선택자 (ID Selector) */
        #my-id {
            background-color: beige;
        }

        /* 태그 선택자 (Tag Selector) */
        input[type="text"] {
            border: 1px dotted black;
        }

        /* 태그 선택자 (Tag Selector) */
        input[type="password"] {
            border: 1px dotted black;
        }
    </style>
</head>
<body>
    <h1>모든 CSS 선택자</h1>

    <p>태그 선택자 (Tag Selector)</p>
    <p class="my-class">클래스 선택자 (Class Selector)</p>
    <p id="my-id">아이디 선택자 (ID Selector)</p>
    <ul>
        <li>자식 선택자 (Child Selector)</li>
        <li>자식 선택자 (Child Selector)</li>
        <li>자식 선택자 (Child Selector)</li>
    </ul>
    <h2>인접 형제 선택자 (Adjacent Sibling Selector)</h2>
    <p>인접 형제 선택자 (Adjacent Sibling Selector)</p>
    <p>일반 형제 선택자 (General Sibling Selector)</p>
    <p>일반 형제 선택자 (General Sibling Selector)</p>
    <p>일반 형제 선택자 (General Sibling Selector)</p>
    <a href="#" title="속성 선택자 (Attribute Selector)">속성 선택자 (Attribute Selector)</a>
    <p><a href="#" class="link">가상 클래스 선택자 (Pseudo-Class Selector)</a></p>

    <form>
        <label for="name">이름</label>
        <input type="text" id="name" name="name">

        <label for="email">이메일</label>
        <input type="email" id="email" name="email">

        <label for="password">비밀번호</label>
        <input type="password" id="password" name="password">

        <label for="gender">성별</label>
        <select id="gender" name="gender">
            <option value="male">남성</option>
            <option value="female">여성</option>
        </select>
```
