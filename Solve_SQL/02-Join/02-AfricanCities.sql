SELECT city.name
FROM country
JOIN city ON city.countrycode=country.code
WHERE continent='africa'
