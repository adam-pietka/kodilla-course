-- Listę zadań z tabeli ISSUESS z dołączonymi do nich nazwami list zadań z tabeli ISSUESLISTS
select
-- *
  ISSUESS.ISSUESLISTS_ID
, ISSUESS.SUMMARY
, ISSUESS.DESCRIPTION
, ISSUESLISTS.NAME
from ISSUESS  left join ISSUESLISTS
on ISSUESS.ISSUESLISTS_ID = ISSUESLISTS.ID ;

-- Listę zadań z tabeli ISSUESS z przypisanymi do nich użytkownikami z tabeli USERS

select 
--*
  USES.NAME
, ISSUESS.SUMMARY
, ISSUESS.DESCRIPTION
, ISSUESS.USER_ID_ASSIGNEDTO
	from ISSUESS left join USERS
	ON ISSUESS.USER_ID_ASSIGNEDTO = USERS.ID;
	
	
-- Imiona i nazwiska użytkowników posiadających zadania, wraz z informacją o ilości zadań, które są do nich przypisane

SELECT 
  USERS.FIRSTNAME
, USERS.LASTNAME
, COUNT(ISSUES.ID) as AssignedTaskCounter
	FROM USERS left join ISSUES
	on USERS.ID = ISSUES.USER_ID_ASSIGNEDTO
	groupe by USERS.NAME, USERS.LASTNAME;