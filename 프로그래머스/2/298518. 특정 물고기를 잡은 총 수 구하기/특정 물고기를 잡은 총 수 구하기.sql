select count(*) fish_count
from FISH_INFO f
left join FISH_NAME_INFO n on f.FISH_TYPE = n.FISH_TYPE
where FISH_NAME in ('BASS','SNAPPER');