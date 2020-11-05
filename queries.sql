## Part 1: Test it with SQL

SELECT * FROM tech_jobs.columns;

## Part 2: Test it with SQL

SELECT *
FROM employer
WHERE location = "St. Louis, MO"

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT DISTINCT name, description
FROM tech_jobs.job_skills
JOIN tech_jobs.skill ON tech_jobs.job_skills.skills_id = tech_jobs.skill.id
WHERE jobs_id IS NOT NULL
ORDER BY name ASC;
