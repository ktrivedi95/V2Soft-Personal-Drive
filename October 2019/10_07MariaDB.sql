SELECT address_line_one, address_line_two FROM employee_address ea LEFT JOIN employee_info ei
ON ea.employee_id = ei.employee_id
WHERE ei.ssn = '12345678';