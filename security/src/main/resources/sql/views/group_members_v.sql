CREATE OR REPLACE VIEW drdeesw.group_members_v AS
   SELECT gm.id, gm.group_id, gm.user_id, gm.username, g.group_name, u.name
     FROM drdeesw.group_members gm
LEFT JOIN drdeesw.groups g ON g.id      = gm.group_id
LEFT JOIN drdeesw.users  u ON u.user_id = gm.user_id;