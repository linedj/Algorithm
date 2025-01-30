select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPER_INFOS
where 'Python' in (skill_1, skill_2, skill_3)
order by ID;