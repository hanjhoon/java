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

    <label for="agree">약관 동의</label>
    <input type="checkbox" id="agree" name="agree">

    <button type="submit">제출</button>
</form>

<h2>테이블</h2>
<table>
    <thead>
        <tr>
            <th>이름</th>
            <th>나이</th>
            <th>성별</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>홍길동</td>
            <td>20</td>
            <td>남성</td>
        </tr>
        <tr>
            <td>김영희</td>
            <td>25</td>
            <td>여성</td>
        </tr>
        <tr>
            <td>이철수</td>
            <td>30</td>
            <td>남성</td>
        </tr>
    </tbody>
</table>

<div class="box">박스</div>

<style>
    /* 폼 요소 스타일 */
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    label {
        margin-top: 10px;
        margin-bottom: 5px;
        font-weight: bold;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"],
    select {
        margin-bottom: 10px;
        padding: 5px;
        border-radius: 5px;
        border: none;
        box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.3);
    }

    input[type="checkbox"] {
        margin-right: 5px;
    }

    button[type="submit"] {
        margin-top: 10px;
        padding: 5px 10px;
        border-radius: 5px;
        border: none;
        background-color: rgb(11, 23, 45);
        color: white;
        font-weight: bold;
        cursor: pointer;
    }

    /* 테이블 스타일 */
    table {
        border-collapse: collapse;
        margin-top: 20px;
        width: 100%;
    }

    th,
    td {
        padding: 10px;
        text-align: center;
        border: 1px solid black;
    }

    th {
        background-color: rgb(11, 23, 45);
        color: white;
    }

    tbody tr:nth-child(even) {
        background-color: rgba(11, 23, 45, 0.1);
    }

    /* 박스 스타일 */
    .box {
        margin-top: 20px;
        width: 200px;
        height: 200px;
        background-color: beige;
        border-radius: 10px;
        box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.3);
        display: flex;
        justify-content: center;
        align-items: center;
        font-weight: bold;
        font-size: 2rem;
    }
</style>
```
