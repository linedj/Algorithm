SELECT HALF.FLAVOR
FROM FIRST_HALF  HALF JOIN ICECREAM_INFO INFO ON HALF.FLAVOR = INFO.FLAVOR
WHERE TOTAL_ORDER>3000 AND INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC