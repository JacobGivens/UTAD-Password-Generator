local characters = {}
local specials = {'!', '"', '$', '%', ',', '(', ')', '*', '+', '-', '.', '/', ';', ':', '=', '>', '?', '^', '_', '{', '|', '}', '~', '\\', '[', ']'}
--[[for i = 1, #specials do
	table.insert(characters, specials[i])
end]]
for i = 0, 25 do
	table.insert(characters, string.char(65+i))
	table.insert(characters, string.char(97+i))
	table.insert(characters, specials[i+1])
end

--[[
for i,v in ipairs(characters) do
	print(v)
end
--]]

repeat
	print("Enter=Continue, Continue to generate or enter value and continue to terminate.")
	local propPass = {}
	for i = 0, 14 do
		local insChar = characters[math.random(#characters)]
		table.insert(propPass, insChar)
		--print(insChar)
	end
	print(table.concat(propPass))
until (io.read() ~= "")

os.exit()
