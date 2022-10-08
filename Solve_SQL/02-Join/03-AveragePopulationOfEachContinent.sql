SELECT c.continent
FROM country as c
JOIN city ON c.code=city.countrycode
