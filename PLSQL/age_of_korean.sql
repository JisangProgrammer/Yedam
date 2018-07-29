DECLARE
    v_age number := &b_age;
    v_
BEGIN
    if mod(v_age, 12) = 0 then
        dbms_output.put_line('Dog');
    elsif mod(v_age, 12) = 1 then
        dbms_output.put_line('Pig');
    elsif mod(v_age, 12) = 2 then
        dbms_output.put_line('Mouse');
    elsif mod(v_age, 12) = 3 then
        dbms_output.put_line('Cow');
    elsif mod(v_age, 12) = 4 then
        dbms_output.put_line('Tiger');
    elsif mod(v_age, 12) = 5 then
        dbms_output.put_line('Rabbit');
    elsif mod(v_age, 12) = 6 then
        dbms_output.put_line('Dragon');
    elsif mod(v_age, 12) = 7 then
        dbms_output.put_line('Snake');
    elsif mod(v_age, 12) = 8 then
        dbms_output.put_line('Horse');
    elsif mod(v_age, 12) = 9 then
        dbms_output.put_line('Sheep');
    elsif mod(v_age, 12) = 10 then
        dbms_output.put_line('Monkey');
    else
        dbms_output.put_line('Chicken');
END;
/