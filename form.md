```html
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
    <form action="http://localhost:8080/employees" method="post">
        <label for="emp_no">사원 번호</label><br>
        <input type="text" id="emp_no" name="emp_no"><br>

        <label for="birth_day">생년 월일</label><br>
        <input type="date" id="birth_date" name="birth_date"><br>

        <label for="first_name">이름</label><br>
        <input type="text" id="first_name" name="first_name"><br>

        <label for="last_name">성</label><br>
        <input type="text" id="last_name" name="last_name"><br>
        
        <!-- radio -->
        <label for="female">여성</label>
        <input type="radio" id="female" name="gender" value="F">
        
        <label for="male">남성</label>
        <input type="radio" id="male" name="gender" value="M"><br>

        <label for="hire_date">고용일</label><br>
        <input type="date" id="hire_date" name="hire_date"><br>

        <input type="submit" value="확인">
    </form>

    <br>
    <br>
    <br>
    <form>
        <label for="cars">드림카를 선택하세요</label>
        <select id="cars" name="cars" multiple size="6">
            <option value="volvo">볼보</option>
            <option value="bmw">브암바</option>
            <option value="benz">벤츠</option>
            <option value="maserati">마세라티</option>
            <option value="hyundai">현대</option>
            <option value="kia">기아</option>
        </select>
        <textarea name="content" rows="10" cols="30" style="width:300px;height:100px;resize:none">
            기본으로 적히는 내용입니다.
        </textarea>
    </form>
</html>
```
