SELECT 
    c.ID,
    c.GENOTYPE AS GENOTYPE,
    p.GENOTYPE AS PARENT_GENOTYPE
FROM ECOLI_DATA as c JOIN ECOLI_DATA as p 
ON c.PARENT_ID = p.ID
WHERE (c.GENOTYPE & p.GENOTYPE) = p.GENOTYPE
ORDER BY c.ID ASC;