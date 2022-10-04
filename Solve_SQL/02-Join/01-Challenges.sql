SELECT h.hacker_id, h.name, COUNT(c.challenge_id)
FROM hackers AS h
JOIN challenges AS c ON h.hacker_id=c.hacker_id
GROUP BY h.hacker_id, h.name
ORDER BY h.hacker_id ASC, COUNT(c.challenge_id) ASC