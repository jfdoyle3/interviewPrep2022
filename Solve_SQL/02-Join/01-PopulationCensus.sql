SELECT SUM(city.population)
FROM country
JOIN city ON country.code=city.countrycode
WHERE country.continent='asia'
